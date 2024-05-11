import React, { useState } from 'react';
import TransactionsTable from './TransactionsTable';
import TransactionsStatistics from './TransactionsStatistics';
import TransactionsBarChart from './TransactionsBarChart';
import MonthDropdown from './MonthDropdown';
import './App.css';

function App() {
  const [selectedMonth, setSelectedMonth] = useState('March');
  const [searchQuery, setSearchQuery] = useState('');
  const [page, setPage] = useState(1);

  return (
    <div className="App">
      <h1>Transactions Dashboard</h1>
      <MonthDropdown selectedMonth={selectedMonth} setSelectedMonth={setSelectedMonth} />
      <TransactionsStatistics selectedMonth={selectedMonth} />
      <TransactionsBarChart selectedMonth={selectedMonth} />
      <TransactionsTable
        selectedMonth={selectedMonth}
        searchQuery={searchQuery}
        setSearchQuery={setSearchQuery}
        page={page}
        setPage={setPage}
      />
    </div>
  );
}

export default App;
